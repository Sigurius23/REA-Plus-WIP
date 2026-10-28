.class public final Lw23/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lec3/h2;

.field public final b:Lec3/r1;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lw23/q;

    sget-object v4, Lx23/f;->w:Lx23/f;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v5, v4

    invoke-direct/range {v0 .. v5}, Lw23/q;-><init>(Lbc3/k1;Lbc3/k1;Lbc3/k1;Lx23/f;Lx23/f;)V

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lw23/r;->a:Lec3/h2;

    invoke-static {v0}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v0

    iput-object v0, p0, Lw23/r;->b:Lec3/r1;

    return-void
.end method
