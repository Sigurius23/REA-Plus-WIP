.class final Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$c$a$a;->w:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ll83/k;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/k;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast p2, Ljk0/d;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Lst0/f;

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$c$a$a;->w:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {v0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->p0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)V

    sget-object v0, Lst0/n;->a:Lst0/n;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lst0/m;->a:Lst0/m;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, Lst0/g;->a:Lst0/g;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$c$a$a;->w:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->r0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Z)V

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$c$a$a;->w:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->s0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ljk0/d;)V

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$c$a$a;->w:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->m0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)V

    goto :goto_1

    :cond_1
    instance-of p2, p1, Lst0/i;

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$c$a$a;->w:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    check-cast p1, Lst0/i;

    invoke-static {p2, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->l0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lst0/i;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$c$a$a;->w:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->t0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)V

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$c$a$a;->w:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->o0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ljk0/d;)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll83/k;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$c$a$a;->b(Ll83/k;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
