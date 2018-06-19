package edu.cnm.deepdive.nicklocicero.geoquiz;

public class Question {
  private int mTextResId;
  private int mImageId;
  private boolean mAnswerTrue;

  public int getTextResId() {
    return mTextResId;
  }

  public boolean isAnswerTrue() {
    return mAnswerTrue;
  }

  public void setTextResId(int textResId) {
    mTextResId = textResId;
  }

  public void setAnswerTrue(boolean answerTrue) {
    mAnswerTrue = answerTrue;
  }

  public Question(int TextResId, int imageId, boolean answerTrue) {
    mTextResId = TextResId;
    mImageId = imageId;
    mAnswerTrue = answerTrue;
  }

  public int getImageId() {
    return mImageId;
  }

  public void setImageId(int imageId) {
    mImageId = imageId;
  }
}
