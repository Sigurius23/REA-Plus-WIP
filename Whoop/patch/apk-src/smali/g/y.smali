.class public final Lg/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg/b;


# instance fields
.field public final w:Lg/t;

.field public final synthetic x:Lg/z;


# direct methods
.method public constructor <init>(Lg/z;Lg/t;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "onBackPressedCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lg/y;->x:Lg/z;

    iput-object p2, p0, Lg/y;->w:Lg/t;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 4

    iget-object v0, p0, Lg/y;->x:Lg/z;

    iget-object v1, v0, Lg/z;->b:Lm83/m;

    iget-object v2, p0, Lg/y;->w:Lg/t;

    invoke-virtual {v1, v2}, Lm83/m;->remove(Ljava/lang/Object;)Z

    iget-object v1, v0, Lg/z;->c:Lg/t;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Lg/t;->c()V

    iput-object v3, v0, Lg/z;->c:Lg/t;

    :cond_0
    invoke-virtual {v2, p0}, Lg/t;->i(Lg/b;)V

    invoke-virtual {v2}, Lg/t;->b()Lc93/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_1
    invoke-virtual {v2, v3}, Lg/t;->k(Lc93/a;)V

    return-void
.end method
