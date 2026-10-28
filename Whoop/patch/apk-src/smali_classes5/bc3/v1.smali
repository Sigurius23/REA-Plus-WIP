.class public final Lbc3/v1;
.super Lbc3/c2;
.source "SourceFile"


# instance fields
.field public final z:Lq83/d;


# direct methods
.method public constructor <init>(Lq83/j;Lc93/m;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1, v1, v0}, Lbc3/a;-><init>(Lq83/j;ZZ)V

    invoke-static {p2, p0, p0}, Lge3/g;->p(Lc93/m;Lq83/d;Lq83/d;)Lq83/d;

    move-result-object p1

    iput-object p1, p0, Lbc3/v1;->z:Lq83/d;

    return-void
.end method


# virtual methods
.method public final S()V
    .locals 1

    iget-object v0, p0, Lbc3/v1;->z:Lq83/d;

    invoke-static {v0, p0}, Ldt/b;->T(Lq83/d;Lbc3/a;)V

    return-void
.end method
