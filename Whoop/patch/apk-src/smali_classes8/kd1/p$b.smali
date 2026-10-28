.class public final Lkd1/p$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/h0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkd1/p;->g(Lkd1/o$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;
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
        "kd1/p$b",
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
.field final synthetic a:Lkd1/m;

.field final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkd1/m;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lkd1/p$b;->a:Lkd1/m;

    iput-object p2, p0, Lkd1/p$b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, Lkd1/p$b;->a:Lkd1/m;

    iget-object v1, p0, Lkd1/p$b;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lkd1/m;->f(Ljava/lang/Object;)V

    return-void
.end method
