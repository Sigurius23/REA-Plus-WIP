.class final synthetic Lcp0/x0$i;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcp0/x0;->S(Lch0/v0;Lsl0/n0;FFZFLjava/lang/String;Ljava/lang/Integer;ZJFFFZZFLandroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLc93/a;Lc93/a;Lc93/a;Lc93/a;Lcp0/w;Lkotlin/jvm/functions/Function1;Lql0/c;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/i;",
        "Lkotlin/jvm/functions/Function3;"
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


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v6, "retryAttachmentUpload(Landroid/net/Uri;Ljava/lang/String;Lcom/whoop/ai/chat/models/AttachmentType;)V"

    const/4 v2, 0x0

    const/4 v1, 0x3

    const-class v3, Lch0/v0;

    const-string v5, "retryAttachmentUpload"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/net/Uri;Ljava/lang/String;Lcom/whoop/ai/chat/models/AttachmentType;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p2"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lch0/v0;

    invoke-virtual {v0, p1, p2, p3}, Lch0/v0;->t(Landroid/net/Uri;Ljava/lang/String;Lcom/whoop/ai/chat/models/AttachmentType;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/net/Uri;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Lcom/whoop/ai/chat/models/AttachmentType;

    invoke-virtual {p0, p1, p2, p3}, Lcp0/x0$i;->a(Landroid/net/Uri;Ljava/lang/String;Lcom/whoop/ai/chat/models/AttachmentType;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
