.class public final Led3/d;
.super Led3/e;
.source "SourceFile"


# direct methods
.method public constructor <init>(JLdd3/a;Le10/k0;Lyc3/g;)V
    .locals 1

    const-string v0, "proto"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parentWriter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p5}, Led3/e;-><init>(JLdd3/a;Le10/k0;Lyc3/g;)V

    return-void
.end method


# virtual methods
.method public final Q(Lyc3/g;I)J
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x2

    rem-int/2addr p2, p1

    iget-wide v0, p0, Led3/e;->h:J

    if-nez p2, :cond_0

    invoke-static {v0, v1}, Luf/c0;->S(J)Ldd3/b;

    move-result-object p1

    iget-wide p1, p1, Ldd3/b;->w:J

    const/4 v0, 0x1

    int-to-long v0, v0

    or-long/2addr p1, v0

    return-wide p1

    :cond_0
    invoke-static {v0, v1}, Luf/c0;->S(J)Ldd3/b;

    move-result-object p2

    iget-wide v0, p2, Ldd3/b;->w:J

    int-to-long p1, p1

    or-long/2addr p1, v0

    return-wide p1
.end method
