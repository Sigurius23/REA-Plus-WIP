.class public final Lyi0/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/h0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyi0/d;->m(Lti0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
        "yi0/d$b",
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
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lp1/t2;


# direct methods
.method public constructor <init>(Ljava/util/Map;Lp1/t2;)V
    .locals 0

    iput-object p1, p0, Lyi0/d$b;->a:Ljava/util/Map;

    iput-object p2, p0, Lyi0/d$b;->b:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 3

    iget-object v0, p0, Lyi0/d$b;->a:Ljava/util/Map;

    invoke-static {v0}, Lyi0/d;->H(Ljava/util/Map;)Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lyi0/d$b;->b:Lp1/t2;

    invoke-static {v1}, Lyi0/d;->z(Lp1/t2;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    new-instance v2, Lri0/b$g;

    invoke-direct {v2, v0}, Lri0/b$g;-><init>(Lcom/whoop/analytics/AnalyticEventModel;)V

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
