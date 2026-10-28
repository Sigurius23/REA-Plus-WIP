.class public final synthetic Lcp0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:F

.field public final synthetic w:Lcp0/t;

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Lcp0/t;FFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcp0/u;->w:Lcp0/t;

    iput p2, p0, Lcp0/u;->x:F

    iput p3, p0, Lcp0/u;->y:F

    iput p4, p0, Lcp0/u;->z:F

    iput p5, p0, Lcp0/u;->E:F

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lcp0/u;->z:F

    iget v1, p0, Lcp0/u;->E:F

    iget-object v2, p0, Lcp0/u;->w:Lcp0/t;

    iget v3, p0, Lcp0/u;->x:F

    iget v4, p0, Lcp0/u;->y:F

    invoke-static {v2, v3, v4, v0, v1}, Lcp0/v;->a(Lcp0/t;FFFF)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
