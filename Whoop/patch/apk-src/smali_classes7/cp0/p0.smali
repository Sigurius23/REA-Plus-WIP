.class public final synthetic Lcp0/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lf0/r1;

.field public final synthetic x:F

.field public final synthetic y:F


# direct methods
.method public synthetic constructor <init>(Lf0/r1;FF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcp0/p0;->w:Lf0/r1;

    iput p2, p0, Lcp0/p0;->x:F

    iput p3, p0, Lcp0/p0;->y:F

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lcp0/p0;->x:F

    iget v1, p0, Lcp0/p0;->y:F

    iget-object v2, p0, Lcp0/p0;->w:Lf0/r1;

    invoke-static {v2, v0, v1}, Lcp0/x0;->L(Lf0/r1;FF)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
