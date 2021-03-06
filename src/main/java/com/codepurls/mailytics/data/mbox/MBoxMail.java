package com.codepurls.mailytics.data.mbox;

import javax.mail.BodyPart;
import javax.mail.Message;

import com.codepurls.mailytics.data.core.Attachment;
import com.codepurls.mailytics.data.core.JavaMailBase;

public final class MBoxMail extends JavaMailBase<MBoxFolder> {

  public MBoxMail(MBoxFolder folder, Message mail) {
    super(folder, mail);
  }

  @Override
  protected Attachment newAttachment(BodyPart part) {
    return new MBoxAttachment(part);
  }
}
