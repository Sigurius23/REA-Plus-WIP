.class public final synthetic Lvy0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:F

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Lp1/z0;


# direct methods
.method public synthetic constructor <init>(FLc93/a;Lc93/a;Lp1/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lvy0/n;->w:F

    iput-object p2, p0, Lvy0/n;->x:Lc93/a;

    iput-object p3, p0, Lvy0/n;->y:Lc93/a;

    iput-object p4, p0, Lvy0/n;->z:Lp1/z0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lvy0/n;->y:Lc93/a;

    iget-object v1, p0, Lvy0/n;->z:Lp1/z0;

    iget v2, p0, Lvy0/n;->w:F

    iget-object v3, p0, Lvy0/n;->x:Lc93/a;

    invoke-static {v2, v3, v0, v1}, Lvy0/p$a;->c(FLc93/a;Lc93/a;Lp1/z0;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
