.class public final synthetic Lzq0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lp1/t2;

.field public final synthetic w:Lkotlin/jvm/internal/d0;

.field public final synthetic x:F

.field public final synthetic y:Z

.field public final synthetic z:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/d0;FZLp1/t2;Lp1/t2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzq0/i;->w:Lkotlin/jvm/internal/d0;

    iput p2, p0, Lzq0/i;->x:F

    iput-boolean p3, p0, Lzq0/i;->y:Z

    iput-object p4, p0, Lzq0/i;->z:Lp1/t2;

    iput-object p5, p0, Lzq0/i;->E:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lzq0/i;->z:Lp1/t2;

    iget-object v1, p0, Lzq0/i;->E:Lp1/t2;

    iget-object v2, p0, Lzq0/i;->w:Lkotlin/jvm/internal/d0;

    iget v3, p0, Lzq0/i;->x:F

    iget-boolean v4, p0, Lzq0/i;->y:Z

    invoke-static {v2, v3, v4, v0, v1}, Lzq0/f$d;->b(Lkotlin/jvm/internal/d0;FZLp1/t2;Lp1/t2;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
