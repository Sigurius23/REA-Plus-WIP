.class public final Lio/sentry/android/core/anr/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final w:[Ljava/lang/StackTraceElement;

.field public final x:J


# direct methods
.method public constructor <init>(J[Ljava/lang/StackTraceElement;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lio/sentry/android/core/anr/f;->x:J

    iput-object p3, p0, Lio/sentry/android/core/anr/f;->w:[Ljava/lang/StackTraceElement;

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/DataOutputStream;)V
    .locals 9

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    iget-wide v1, p0, Lio/sentry/android/core/anr/f;->x:J

    invoke-virtual {p1, v1, v2}, Ljava/io/DataOutputStream;->writeLong(J)V

    iget-object v1, p0, Lio/sentry/android/core/anr/f;->w:[Ljava/lang/StackTraceElement;

    array-length v2, v1

    invoke-virtual {p1, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_4

    aget-object v5, v1, v4

    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lio/sentry/util/m;->a:Ljava/nio/charset/Charset;

    const-string v7, ""

    if-nez v6, :cond_0

    move-object v6, v7

    :cond_0
    invoke-virtual {p1, v6}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_1

    move-object v6, v7

    :cond_1
    invoke-virtual {p1, v6}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_2

    move v8, v0

    goto :goto_1

    :cond_2
    move v8, v3

    :goto_1
    invoke-virtual {p1, v8}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    if-nez v6, :cond_3

    goto :goto_2

    :cond_3
    move-object v7, v6

    :goto_2
    invoke-virtual {p1, v7}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v5

    invoke-virtual {p1, v5}, Ljava/io/DataOutputStream;->writeInt(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Lio/sentry/android/core/anr/f;

    iget-wide v0, p0, Lio/sentry/android/core/anr/f;->x:J

    iget-wide v2, p1, Lio/sentry/android/core/anr/f;->x:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    return p1
.end method
