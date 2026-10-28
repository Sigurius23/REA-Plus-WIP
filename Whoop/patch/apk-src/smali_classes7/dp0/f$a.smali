.class public final Ldp0/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/h0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldp0/f;->b(Landroidx/compose/ui/Modifier;Lep0/j;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
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
        "dp0/f$a",
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
.field final synthetic a:Ltr2/n;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lep0/j;

.field final synthetic d:Ldp0/g;


# direct methods
.method public constructor <init>(Ltr2/n;Ljava/lang/String;Lep0/j;Ldp0/g;)V
    .locals 0

    iput-object p1, p0, Ldp0/f$a;->a:Ltr2/n;

    iput-object p2, p0, Ldp0/f$a;->b:Ljava/lang/String;

    iput-object p3, p0, Ldp0/f$a;->c:Lep0/j;

    iput-object p4, p0, Ldp0/f$a;->d:Ldp0/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 5

    iget-object v0, p0, Ldp0/f$a;->a:Ltr2/n;

    iget-object v1, p0, Ldp0/f$a;->b:Ljava/lang/String;

    iget-object v2, p0, Ldp0/f$a;->c:Lep0/j;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "DisposableEffect: onDispose - screenId: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", context: "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Ldp0/f$a;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldp0/f$a;->d:Ldp0/g;

    invoke-interface {v0}, Ldp0/g;->c()V

    iget-object v0, p0, Ldp0/f$a;->d:Ldp0/g;

    iget-object v1, p0, Ldp0/f$a;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ldp0/g;->h(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
