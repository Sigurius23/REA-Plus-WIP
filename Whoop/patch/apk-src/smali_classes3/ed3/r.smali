.class public final Led3/r;
.super Led3/n;
.source "SourceFile"


# instance fields
.field public final g:J


# direct methods
.method public constructor <init>(JLdd3/a;Le10/k0;Lyc3/g;)V
    .locals 1

    const-string v0, "proto"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "writer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3, p4, p5}, Led3/n;-><init>(Ldd3/a;Le10/k0;Lyc3/g;)V

    iput-wide p1, p0, Led3/r;->g:J

    return-void
.end method


# virtual methods
.method public final Q(Lyc3/g;I)J
    .locals 0

    const-string p2, "<this>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide p1, p0, Led3/r;->g:J

    return-wide p1
.end method
