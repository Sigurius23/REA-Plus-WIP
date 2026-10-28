package io0;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.clinicianintheloop.api.PersonalIntakeForm;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: io0.u */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u0016J\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0088\u0001\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00172\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\b0\u0010-R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010+\u001a\u0004\b1\u0010-R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b4\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b5\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b6\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010+\u001a\u0004\b7\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b8\u0010-¨\u00069"}, m65681d2 = {"Lio0/u;", "", "Lio0/r;", "firstName", "lastName", "dateOfBirth", "addressLine1", "addressLine2", "city", "state", "zipCode", "country", "phoneNumber", "<init>", "(Lio0/r;Lio0/r;Lio0/r;Lio0/r;Lio0/r;Lio0/r;Lio0/r;Lio0/r;Lio0/r;Lio0/r;)V", "Lio0/v;", "type", "c", "(Lio0/v;)Lio0/r;", "", "value", "p", "(Lio0/v;Ljava/lang/String;)Lio0/u;", "", "isValid", "q", "(Lio0/v;Z)Lio0/u;", "errorMessage", "r", "Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;", "form", "d", "(Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;)Lio0/u;", "a", "(Lio0/r;Lio0/r;Lio0/r;Lio0/r;Lio0/r;Lio0/r;Lio0/r;Lio0/r;Lio0/r;Lio0/r;)Lio0/u;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lio0/r;", "k", "()Lio0/r;", "b", "l", "j", "f", "e", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "n", "o", "i", "m", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20734u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C20731r firstName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C20731r lastName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C20731r dateOfBirth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C20731r addressLine1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C20731r addressLine2;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C20731r city;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C20731r state;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C20731r zipCode;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C20731r country;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C20731r phoneNumber;

    /* JADX INFO: renamed from: io0.u$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f77810a;

        static {
            int[] iArr = new int[EnumC20735v.values().length];
            try {
                iArr[EnumC20735v.FIRST_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC20735v.LAST_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC20735v.DATE_OF_BIRTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC20735v.ADDRESS_LINE_1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC20735v.ADDRESS_LINE_2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC20735v.CITY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC20735v.STATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC20735v.ZIP_CODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC20735v.COUNTRY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC20735v.PHONE_NUMBER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f77810a = iArr;
        }
    }

    public C20734u(C20731r c20731r, C20731r c20731r2, C20731r c20731r3, C20731r c20731r4, C20731r c20731r5, C20731r c20731r6, C20731r c20731r7, C20731r c20731r8, C20731r c20731r9, C20731r c20731r10) {
        this.firstName = c20731r;
        this.lastName = c20731r2;
        this.dateOfBirth = c20731r3;
        this.addressLine1 = c20731r4;
        this.addressLine2 = c20731r5;
        this.city = c20731r6;
        this.state = c20731r7;
        this.zipCode = c20731r8;
        this.country = c20731r9;
        this.phoneNumber = c20731r10;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C20734u m57019b(C20734u c20734u, C20731r c20731r, C20731r c20731r2, C20731r c20731r3, C20731r c20731r4, C20731r c20731r5, C20731r c20731r6, C20731r c20731r7, C20731r c20731r8, C20731r c20731r9, C20731r c20731r10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c20731r = c20734u.firstName;
        }
        if ((i13 & 2) != 0) {
            c20731r2 = c20734u.lastName;
        }
        if ((i13 & 4) != 0) {
            c20731r3 = c20734u.dateOfBirth;
        }
        if ((i13 & 8) != 0) {
            c20731r4 = c20734u.addressLine1;
        }
        if ((i13 & 16) != 0) {
            c20731r5 = c20734u.addressLine2;
        }
        if ((i13 & 32) != 0) {
            c20731r6 = c20734u.city;
        }
        if ((i13 & 64) != 0) {
            c20731r7 = c20734u.state;
        }
        if ((i13 & 128) != 0) {
            c20731r8 = c20734u.zipCode;
        }
        if ((i13 & 256) != 0) {
            c20731r9 = c20734u.country;
        }
        if ((i13 & 512) != 0) {
            c20731r10 = c20734u.phoneNumber;
        }
        C20731r c20731r11 = c20731r9;
        C20731r c20731r12 = c20731r10;
        C20731r c20731r13 = c20731r7;
        C20731r c20731r14 = c20731r8;
        C20731r c20731r15 = c20731r5;
        C20731r c20731r16 = c20731r6;
        return c20734u.m57021a(c20731r, c20731r2, c20731r3, c20731r4, c20731r15, c20731r16, c20731r13, c20731r14, c20731r11, c20731r12);
    }

    /* JADX INFO: renamed from: e */
    private static final C20731r m57020e(C20734u c20734u, PersonalIntakeForm personalIntakeForm, EnumC20735v enumC20735v) {
        C20731r c20731rM57022c = c20734u.m57022c(enumC20735v);
        if (c20731rM57022c != null) {
            return c20731rM57022c;
        }
        String text = AbstractC20730q.m57008a(personalIntakeForm, enumC20735v).getText();
        if (text != null) {
            String str = !AbstractC39414r.m125890i0(text) ? text : null;
            if (str != null) {
                return new C20731r(str, false, null, 6, null);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C20734u m57021a(C20731r firstName, C20731r lastName, C20731r dateOfBirth, C20731r addressLine1, C20731r addressLine2, C20731r city, C20731r state, C20731r zipCode, C20731r country, C20731r phoneNumber) {
        return new C20734u(firstName, lastName, dateOfBirth, addressLine1, addressLine2, city, state, zipCode, country, phoneNumber);
    }

    /* JADX INFO: renamed from: c */
    public final C20731r m57022c(EnumC20735v type) {
        AbstractC22676k.m65750j(type, "type");
        switch (a.f77810a[type.ordinal()]) {
            case 1:
                return this.firstName;
            case 2:
                return this.lastName;
            case 3:
                return this.dateOfBirth;
            case 4:
                return this.addressLine1;
            case 5:
                return this.addressLine2;
            case 6:
                return this.city;
            case 7:
                return this.state;
            case 8:
                return this.zipCode;
            case 9:
                return this.country;
            case 10:
                return this.phoneNumber;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: d */
    public final C20734u m57023d(PersonalIntakeForm form) {
        AbstractC22676k.m65750j(form, "form");
        return new C20734u(m57020e(this, form, EnumC20735v.FIRST_NAME), m57020e(this, form, EnumC20735v.LAST_NAME), m57020e(this, form, EnumC20735v.DATE_OF_BIRTH), m57020e(this, form, EnumC20735v.ADDRESS_LINE_1), m57020e(this, form, EnumC20735v.ADDRESS_LINE_2), m57020e(this, form, EnumC20735v.CITY), m57020e(this, form, EnumC20735v.STATE), m57020e(this, form, EnumC20735v.ZIP_CODE), m57020e(this, form, EnumC20735v.COUNTRY), m57020e(this, form, EnumC20735v.PHONE_NUMBER));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20734u)) {
            return false;
        }
        C20734u c20734u = (C20734u) other;
        return AbstractC22676k.m65745e(this.firstName, c20734u.firstName) && AbstractC22676k.m65745e(this.lastName, c20734u.lastName) && AbstractC22676k.m65745e(this.dateOfBirth, c20734u.dateOfBirth) && AbstractC22676k.m65745e(this.addressLine1, c20734u.addressLine1) && AbstractC22676k.m65745e(this.addressLine2, c20734u.addressLine2) && AbstractC22676k.m65745e(this.city, c20734u.city) && AbstractC22676k.m65745e(this.state, c20734u.state) && AbstractC22676k.m65745e(this.zipCode, c20734u.zipCode) && AbstractC22676k.m65745e(this.country, c20734u.country) && AbstractC22676k.m65745e(this.phoneNumber, c20734u.phoneNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C20731r getAddressLine1() {
        return this.addressLine1;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C20731r getAddressLine2() {
        return this.addressLine2;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C20731r getCity() {
        return this.city;
    }

    public int hashCode() {
        C20731r c20731r = this.firstName;
        int iHashCode = (c20731r == null ? 0 : c20731r.hashCode()) * 31;
        C20731r c20731r2 = this.lastName;
        int iHashCode2 = (iHashCode + (c20731r2 == null ? 0 : c20731r2.hashCode())) * 31;
        C20731r c20731r3 = this.dateOfBirth;
        int iHashCode3 = (iHashCode2 + (c20731r3 == null ? 0 : c20731r3.hashCode())) * 31;
        C20731r c20731r4 = this.addressLine1;
        int iHashCode4 = (iHashCode3 + (c20731r4 == null ? 0 : c20731r4.hashCode())) * 31;
        C20731r c20731r5 = this.addressLine2;
        int iHashCode5 = (iHashCode4 + (c20731r5 == null ? 0 : c20731r5.hashCode())) * 31;
        C20731r c20731r6 = this.city;
        int iHashCode6 = (iHashCode5 + (c20731r6 == null ? 0 : c20731r6.hashCode())) * 31;
        C20731r c20731r7 = this.state;
        int iHashCode7 = (iHashCode6 + (c20731r7 == null ? 0 : c20731r7.hashCode())) * 31;
        C20731r c20731r8 = this.zipCode;
        int iHashCode8 = (iHashCode7 + (c20731r8 == null ? 0 : c20731r8.hashCode())) * 31;
        C20731r c20731r9 = this.country;
        int iHashCode9 = (iHashCode8 + (c20731r9 == null ? 0 : c20731r9.hashCode())) * 31;
        C20731r c20731r10 = this.phoneNumber;
        return iHashCode9 + (c20731r10 != null ? c20731r10.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C20731r getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C20731r getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C20731r getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C20731r getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C20731r getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final C20731r getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final C20731r getZipCode() {
        return this.zipCode;
    }

    /* JADX INFO: renamed from: p */
    public final C20734u m57034p(EnumC20735v type, String value) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(value, "value");
        C20731r c20731r = new C20731r(value, true, null, 4, null);
        switch (a.f77810a[type.ordinal()]) {
            case 1:
                return m57019b(this, c20731r, null, null, null, null, null, null, null, null, null, 1022, null);
            case 2:
                return m57019b(this, null, c20731r, null, null, null, null, null, null, null, null, 1021, null);
            case 3:
                return m57019b(this, null, null, c20731r, null, null, null, null, null, null, null, 1019, null);
            case 4:
                return m57019b(this, null, null, null, c20731r, null, null, null, null, null, null, MessageListItemViewType.LINK_ATTACHMENTS, null);
            case 5:
                return m57019b(this, null, null, null, null, c20731r, null, null, null, null, null, MessageListItemViewType.TYPING_INDICATOR, null);
            case 6:
                return m57019b(this, null, null, null, null, null, c20731r, null, null, null, null, 991, null);
            case 7:
                return m57019b(this, null, null, null, null, null, null, c20731r, null, null, null, 959, null);
            case 8:
                return m57019b(this, null, null, null, null, null, null, null, c20731r, null, null, 895, null);
            case 9:
                return m57019b(this, null, null, null, null, null, null, null, null, c20731r, null, 767, null);
            case 10:
                return m57019b(this, null, null, null, null, null, null, null, null, null, c20731r, FrameMetricsAggregator.EVERY_DURATION, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: q */
    public final C20734u m57035q(EnumC20735v type, boolean isValid) {
        AbstractC22676k.m65750j(type, "type");
        C20731r c20731rM57022c = m57022c(type);
        if (c20731rM57022c == null) {
            return this;
        }
        C20731r c20731rM57009b = C20731r.m57009b(c20731rM57022c, null, isValid, null, 5, null);
        switch (a.f77810a[type.ordinal()]) {
            case 1:
                return m57019b(this, c20731rM57009b, null, null, null, null, null, null, null, null, null, 1022, null);
            case 2:
                return m57019b(this, null, c20731rM57009b, null, null, null, null, null, null, null, null, 1021, null);
            case 3:
                return m57019b(this, null, null, c20731rM57009b, null, null, null, null, null, null, null, 1019, null);
            case 4:
                return m57019b(this, null, null, null, c20731rM57009b, null, null, null, null, null, null, MessageListItemViewType.LINK_ATTACHMENTS, null);
            case 5:
                return m57019b(this, null, null, null, null, c20731rM57009b, null, null, null, null, null, MessageListItemViewType.TYPING_INDICATOR, null);
            case 6:
                return m57019b(this, null, null, null, null, null, c20731rM57009b, null, null, null, null, 991, null);
            case 7:
                return m57019b(this, null, null, null, null, null, null, c20731rM57009b, null, null, null, 959, null);
            case 8:
                return m57019b(this, null, null, null, null, null, null, null, c20731rM57009b, null, null, 895, null);
            case 9:
                return m57019b(this, null, null, null, null, null, null, null, null, c20731rM57009b, null, 767, null);
            case 10:
                return m57019b(this, null, null, null, null, null, null, null, null, null, c20731rM57009b, FrameMetricsAggregator.EVERY_DURATION, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: r */
    public final C20734u m57036r(EnumC20735v type, String errorMessage) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        C20731r c20731rM57022c = m57022c(type);
        String text = c20731rM57022c != null ? c20731rM57022c.getText() : null;
        if (text == null) {
            text = "";
        }
        C20731r c20731r = new C20731r(text, false, errorMessage);
        switch (a.f77810a[type.ordinal()]) {
            case 1:
                return m57019b(this, c20731r, null, null, null, null, null, null, null, null, null, 1022, null);
            case 2:
                return m57019b(this, null, c20731r, null, null, null, null, null, null, null, null, 1021, null);
            case 3:
                return m57019b(this, null, null, c20731r, null, null, null, null, null, null, null, 1019, null);
            case 4:
                return m57019b(this, null, null, null, c20731r, null, null, null, null, null, null, MessageListItemViewType.LINK_ATTACHMENTS, null);
            case 5:
                return m57019b(this, null, null, null, null, c20731r, null, null, null, null, null, MessageListItemViewType.TYPING_INDICATOR, null);
            case 6:
                return m57019b(this, null, null, null, null, null, c20731r, null, null, null, null, 991, null);
            case 7:
                return m57019b(this, null, null, null, null, null, null, c20731r, null, null, null, 959, null);
            case 8:
                return m57019b(this, null, null, null, null, null, null, null, c20731r, null, null, 895, null);
            case 9:
                return m57019b(this, null, null, null, null, null, null, null, null, c20731r, null, 767, null);
            case 10:
                return m57019b(this, null, null, null, null, null, null, null, null, null, c20731r, FrameMetricsAggregator.EVERY_DURATION, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public String toString() {
        return "PersonalIntakeFieldResponses(firstName=" + this.firstName + ", lastName=" + this.lastName + ", dateOfBirth=" + this.dateOfBirth + ", addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ", country=" + this.country + ", phoneNumber=" + this.phoneNumber + ")";
    }

    public /* synthetic */ C20734u(C20731r c20731r, C20731r c20731r2, C20731r c20731r3, C20731r c20731r4, C20731r c20731r5, C20731r c20731r6, C20731r c20731r7, C20731r c20731r8, C20731r c20731r9, C20731r c20731r10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : c20731r, (i13 & 2) != 0 ? null : c20731r2, (i13 & 4) != 0 ? null : c20731r3, (i13 & 8) != 0 ? null : c20731r4, (i13 & 16) != 0 ? null : c20731r5, (i13 & 32) != 0 ? null : c20731r6, (i13 & 64) != 0 ? null : c20731r7, (i13 & 128) != 0 ? null : c20731r8, (i13 & 256) != 0 ? null : c20731r9, (i13 & 512) != 0 ? null : c20731r10);
    }
}
