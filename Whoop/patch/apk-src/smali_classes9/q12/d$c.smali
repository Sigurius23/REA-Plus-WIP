.class public final Lq12/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/h0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq12/d;->h(Lsl0/n0;Landroidx/compose/ui/Modifier;ZFLch0/d0;Lch0/v0;Lc93/m;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
        "q12/d$c",
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
.field final synthetic a:Ldp0/g;

.field final synthetic b:Lch0/v0;


# direct methods
.method public constructor <init>(Ldp0/g;Lch0/v0;)V
    .locals 0

    iput-object p1, p0, Lq12/d$c;->a:Ldp0/g;

    iput-object p2, p0, Lq12/d$c;->b:Lch0/v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    iget-object v0, p0, Lq12/d$c;->a:Ldp0/g;

    invoke-interface {v0}, Ldp0/g;->d()V

    iget-object v0, p0, Lq12/d$c;->b:Lch0/v0;

    invoke-virtual {v0}, Lch0/v0;->l()V

    iget-object v0, p0, Lq12/d$c;->b:Lch0/v0;

    invoke-virtual {v0}, Lch0/v0;->g()V

    iget-object v0, p0, Lq12/d$c;->b:Lch0/v0;

    invoke-virtual {v0}, Lch0/v0;->s()V

    return-void
.end method
