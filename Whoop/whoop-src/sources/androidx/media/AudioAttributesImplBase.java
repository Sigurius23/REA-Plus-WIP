package androidx.media;

import java.util.Arrays;
import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes5.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    public int f6359a = 0;

    /* JADX INFO: renamed from: b */
    public int f6360b = 0;

    /* JADX INFO: renamed from: c */
    public int f6361c = 0;

    /* JADX INFO: renamed from: d */
    public int f6362d = -1;

    public final boolean equals(Object obj) {
        int i13;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f6360b == audioAttributesImplBase.f6360b) {
            int i14 = this.f6361c;
            int i15 = audioAttributesImplBase.f6361c;
            int i16 = audioAttributesImplBase.f6362d;
            if (i16 == -1) {
                int i17 = audioAttributesImplBase.f6359a;
                int i18 = AudioAttributesCompat.f6355b;
                if ((i15 & 1) != 1) {
                    i13 = 4;
                    if ((i15 & 4) != 4) {
                        switch (i17) {
                            case 2:
                                i13 = 0;
                                break;
                            case 3:
                                i13 = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i13 = 5;
                                break;
                            case 6:
                                i13 = 2;
                                break;
                            case 11:
                                i13 = 10;
                                break;
                            case 12:
                            default:
                                i13 = 3;
                                break;
                            case 13:
                                i13 = 1;
                                break;
                        }
                    } else {
                        i13 = 6;
                    }
                } else {
                    i13 = 7;
                }
            } else {
                i13 = i16;
            }
            if (i13 == 6) {
                i15 |= 4;
            } else if (i13 == 7) {
                i15 |= 1;
            }
            if (i14 == (i15 & 273) && this.f6359a == audioAttributesImplBase.f6359a && this.f6362d == i16) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6360b), Integer.valueOf(this.f6361c), Integer.valueOf(this.f6359a), Integer.valueOf(this.f6362d)});
    }

    public final String toString() {
        String strM8295h;
        StringBuilder sb4 = new StringBuilder("AudioAttributesCompat:");
        if (this.f6362d != -1) {
            sb4.append(" stream=");
            sb4.append(this.f6362d);
            sb4.append(" derived");
        }
        sb4.append(" usage=");
        int i13 = this.f6359a;
        int i14 = AudioAttributesCompat.f6355b;
        switch (i13) {
            case 0:
                strM8295h = "USAGE_UNKNOWN";
                break;
            case 1:
                strM8295h = "USAGE_MEDIA";
                break;
            case 2:
                strM8295h = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strM8295h = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strM8295h = "USAGE_ALARM";
                break;
            case 5:
                strM8295h = "USAGE_NOTIFICATION";
                break;
            case 6:
                strM8295h = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strM8295h = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strM8295h = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strM8295h = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strM8295h = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strM8295h = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strM8295h = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strM8295h = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strM8295h = "USAGE_GAME";
                break;
            case 15:
            default:
                strM8295h = AbstractC2875y.m8295h(i13, "unknown usage ");
                break;
            case 16:
                strM8295h = "USAGE_ASSISTANT";
                break;
        }
        sb4.append(strM8295h);
        sb4.append(" content=");
        sb4.append(this.f6360b);
        sb4.append(" flags=0x");
        sb4.append(Integer.toHexString(this.f6361c).toUpperCase());
        return sb4.toString();
    }
}
