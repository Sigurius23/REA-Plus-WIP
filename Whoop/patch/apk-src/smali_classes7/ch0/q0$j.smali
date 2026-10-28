.class public final Lch0/q0$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/h0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch0/q0;->s(Lzg0/i;ZLkotlin/jvm/functions/Function1;Lf0/r1;ZZZLandroidx/compose/runtime/Composer;II)Lch0/o0;
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
        "ch0/q0$j",
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
.field final synthetic a:Lch0/s0;

.field final synthetic b:Lch0/o0;

.field final synthetic c:Lkotlin/jvm/functions/Function1;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lch0/s0;Lch0/o0;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lch0/q0$j;->a:Lch0/s0;

    iput-object p2, p0, Lch0/q0$j;->b:Lch0/o0;

    iput-object p3, p0, Lch0/q0$j;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lch0/q0$j;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 4

    iget-object v0, p0, Lch0/q0$j;->a:Lch0/s0;

    invoke-virtual {v0}, Lch0/s0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lch0/q0$j;->b:Lch0/o0;

    invoke-virtual {v0}, Lch0/o0;->o()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lch0/q0$j;->c:Lkotlin/jvm/functions/Function1;

    new-instance v2, Lzg0/g$i;

    iget-object v3, p0, Lch0/q0$j;->d:Ljava/lang/String;

    invoke-direct {v2, v3, v0}, Lzg0/g$i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
