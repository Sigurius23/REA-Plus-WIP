package lm2;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TextView;
import com.whoop.service.network.model.cycles.Activity;
import com.whoop.service.network.model.cycles.SleepActivity;
import od1.C27843f;
import od1.C27848k;
import org.joda.time.DateTime;
import p031b9.AbstractC2875y;
import uv0.AbstractC35283c;
import xg3.C38280g;

/* JADX INFO: renamed from: lm2.c */
/* JADX INFO: loaded from: classes10.dex */
public class C24517c implements InterfaceC24516b, Parcelable {
    public static final Parcelable.Creator<C24517c> CREATOR = new a();

    /* JADX INFO: renamed from: w */
    private boolean f95670w;

    /* JADX INFO: renamed from: lm2.c$a */
    public class a implements Parcelable.Creator<C24517c> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C24517c createFromParcel(Parcel parcel) {
            return new C24517c(parcel.readByte() == 1);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24517c[] newArray(int i13) {
            return new C24517c[i13];
        }
    }

    public C24517c(boolean z4) {
        this.f95670w = z4;
    }

    @Override // lm2.InterfaceC24516b
    /* JADX INFO: renamed from: b */
    public String mo71413b() {
        return m71417k().getNameKey();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C24517c) {
            return ((C24517c) obj).f95670w == this.f95670w;
        }
        return super.equals(obj);
    }

    @Override // lm2.InterfaceC24516b
    /* JADX INFO: renamed from: f */
    public C38280g<C27848k> mo71414f(C27843f c27843f, DateTime dateTime, DateTime dateTime2) {
        return c27843f.m83941j(this.f95670w, dateTime, dateTime2);
    }

    @Override // lm2.InterfaceC24516b
    /* JADX INFO: renamed from: h */
    public String mo71415h(Context context) {
        return context.getString(this.f95670w ? AbstractC35283c.f150184a : AbstractC35283c.f150185b);
    }

    public int hashCode() {
        return Boolean.hashCode(this.f95670w);
    }

    @Override // lm2.InterfaceC24516b
    /* JADX INFO: renamed from: i */
    public void mo71416i(TextView textView) {
        textView.setText(this.f95670w ? AbstractC35283c.f150184a : AbstractC35283c.f150185b);
    }

    /* JADX INFO: renamed from: k */
    public Activity m71417k() {
        return new SleepActivity(m71418s());
    }

    /* JADX INFO: renamed from: s */
    public boolean m71418s() {
        return this.f95670w;
    }

    public String toString() {
        return AbstractC2875y.m8305r(new StringBuilder("AddableSleep{isNap="), this.f95670w, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeByte(this.f95670w ? (byte) 1 : (byte) 0);
    }
}
