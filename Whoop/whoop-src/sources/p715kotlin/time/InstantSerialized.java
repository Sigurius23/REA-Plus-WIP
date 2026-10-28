package p715kotlin.time;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Lkotlin/time/InstantSerialized;", "Ljava/io/Externalizable;", "", "epochSeconds", "", "nanosecondsOfSecond", "<init>", "(JI)V", "()V", "", "readResolve", "()Ljava/lang/Object;", "Ljava/io/ObjectOutput;", "output", "Ll83/a0;", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/io/ObjectInput;", "input", "readExternal", "(Ljava/io/ObjectInput;)V", "J", "getEpochSeconds", "()J", "setEpochSeconds", "(J)V", "I", "getNanosecondsOfSecond", "()I", "setNanosecondsOfSecond", "(I)V", "Companion", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class InstantSerialized implements Externalizable {
    private static final long serialVersionUID = 0;
    private long epochSeconds;
    private int nanosecondsOfSecond;

    public InstantSerialized(long j7, int i13) {
        this.epochSeconds = j7;
        this.nanosecondsOfSecond = i13;
    }

    private final Object readResolve() {
        return Instant.INSTANCE.fromEpochSeconds(this.epochSeconds, this.nanosecondsOfSecond);
    }

    public final long getEpochSeconds() {
        return this.epochSeconds;
    }

    public final int getNanosecondsOfSecond() {
        return this.nanosecondsOfSecond;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) {
        AbstractC22676k.m65750j(input, "input");
        this.epochSeconds = input.readLong();
        this.nanosecondsOfSecond = input.readInt();
    }

    public final void setEpochSeconds(long j7) {
        this.epochSeconds = j7;
    }

    public final void setNanosecondsOfSecond(int i13) {
        this.nanosecondsOfSecond = i13;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        AbstractC22676k.m65750j(output, "output");
        output.writeLong(this.epochSeconds);
        output.writeInt(this.nanosecondsOfSecond);
    }

    public InstantSerialized() {
        this(0L, 0);
    }
}
