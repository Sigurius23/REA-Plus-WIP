.class final Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->E(Lc93/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ui.drawer.strapsettings.connectstrap.ConnectStrapViewModel$onStrapConnectedForExistingUserV2$1"
    f = "ConnectStrapViewModel.kt"
    l = {
        0x6f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;Lc93/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;",
            "Lc93/a;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->x:Ljava/lang/String;

    iput-object p2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->y:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->z:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    iput-object p4, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->E:Lc93/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;

    iget-object v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->x:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->y:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->z:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    iget-object v4, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->E:Lc93/a;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;Lc93/a;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, p0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->x:Ljava/lang/String;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->y:Ljava/lang/String;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_4

    :cond_3
    :goto_0
    move-object v8, p0

    goto :goto_2

    :cond_4
    sget-object v3, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->z:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->o(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;)Ltr2/n;

    move-result-object v4

    new-instance v7, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e$a;

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->z:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    iget-object v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->x:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->y:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-direct {v7, p1, v1, v5, v6}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e$a;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput v2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->w:I

    const/4 v5, 0x0

    const/4 v9, 0x6

    const/4 v10, 0x0

    move-object v8, p0

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_6

    iget-object p1, v8, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->z:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->r(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;)Lcom/whoop/data/local/prefs/PreferenceHelper;

    move-result-object p1

    const-string v0, "LastRecordedStrapSerial"

    iget-object v1, v8, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->x:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/whoop/data/local/prefs/PreferenceHelper;->putStringValueIntoMainPrefs(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, v8, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->E:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_3

    :cond_6
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_7

    iget-object p1, v8, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->z:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    invoke-virtual {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->K()V

    goto :goto_3

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :goto_2
    iget-object p1, v8, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$e;->z:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->o(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "No strap is paired"

    invoke-interface {p1, v1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
