.class public final Lsc0/h$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/h0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsc0/h;->g(Ljava/lang/String;Lpc0/c;Lpc0/a;Landroidx/compose/runtime/Composer;I)V
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
        "sc0/h$e",
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
.field final synthetic a:Lp1/t2;

.field final synthetic b:Lmc0/c;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lp1/t2;Lmc0/c;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lsc0/h$e;->a:Lp1/t2;

    iput-object p2, p0, Lsc0/h$e;->b:Lmc0/c;

    iput-object p3, p0, Lsc0/h$e;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, Lsc0/h$e;->a:Lp1/t2;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lsc0/h$e;->b:Lmc0/c;

    iget-object v1, p0, Lsc0/h$e;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lmc0/c;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
