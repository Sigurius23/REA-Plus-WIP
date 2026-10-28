.class public abstract Lwn/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final E:J

.field public final F:Lvm/c;

.field public final G:Ljava/lang/String;

.field public final H:Ljava/lang/String;

.field public final I:J

.field public final J:J

.field public final K:Z

.field public final w:Ljava/lang/String;

.field public final x:Lwn/g;

.field public final y:J

.field public final z:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lwn/g;JIJLvm/c;Ljava/lang/String;Ljava/lang/String;JJZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwn/h;->w:Ljava/lang/String;

    iput-object p2, p0, Lwn/h;->x:Lwn/g;

    iput-wide p3, p0, Lwn/h;->y:J

    iput p5, p0, Lwn/h;->z:I

    iput-wide p6, p0, Lwn/h;->E:J

    iput-object p8, p0, Lwn/h;->F:Lvm/c;

    iput-object p9, p0, Lwn/h;->G:Ljava/lang/String;

    iput-object p10, p0, Lwn/h;->H:Ljava/lang/String;

    iput-wide p11, p0, Lwn/h;->I:J

    iput-wide p13, p0, Lwn/h;->J:J

    iput-boolean p15, p0, Lwn/h;->K:Z

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-wide v2, p0, Lwn/h;->E:J

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long p1, v2, v0

    if-gez p1, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
