.class final Lcom/whoop/settings/DebugFragment$i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/DebugFragment$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
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
.field final synthetic w:Lcom/whoop/settings/DebugFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/settings/DebugFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/settings/DebugFragment$i$a;->w:Lcom/whoop/settings/DebugFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll83/k;)Ljava/lang/CharSequence;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/k;",
            ")",
            "Ljava/lang/CharSequence;"
        }
    .end annotation

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Lyh2/a;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment$i$a;->w:Lcom/whoop/settings/DebugFragment;

    invoke-static {v0, v1, v2}, Lcom/whoop/settings/DebugFragment;->F1(Lcom/whoop/settings/DebugFragment;J)Ljava/lang/String;

    move-result-object v0

    const-string v1, ": "

    invoke-static {p1, v1, v0}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll83/k;

    invoke-virtual {p0, p1}, Lcom/whoop/settings/DebugFragment$i$a;->a(Ll83/k;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
