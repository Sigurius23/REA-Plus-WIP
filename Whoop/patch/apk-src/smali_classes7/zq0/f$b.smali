.class public final Lzq0/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/h0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzq0/f;->r(ZLandroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "zq0/f$b",
        "Lp1/h0;",
        "Ll83/a0;",
        "dispose",
        "()V",
        "runtime"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic a:Landroid/view/Window;

.field final synthetic b:Ll83/h;


# direct methods
.method public constructor <init>(Landroid/view/Window;Ll83/h;)V
    .locals 0

    iput-object p1, p0, Lzq0/f$b;->a:Landroid/view/Window;

    iput-object p2, p0, Lzq0/f$b;->b:Ll83/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, Lzq0/f$b;->b:Ll83/h;

    invoke-static {v0}, Lzq0/f;->N(Ll83/h;)Lzq0/r;

    move-result-object v0

    iget-object v1, p0, Lzq0/f$b;->a:Landroid/view/Window;

    invoke-virtual {v0, v1}, Lzq0/r;->b(Landroid/view/Window;)V

    return-void
.end method
