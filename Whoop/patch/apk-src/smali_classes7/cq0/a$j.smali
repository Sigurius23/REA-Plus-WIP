.class final Lcq0/a$j;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcq0/a;->l(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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

.annotation runtime Ls83/e;
    c = "com.whoop.community.data.repository.ChatRepository"
    f = "ChatRepository.kt"
    l = {
        0x1d,
        0x24
    }
    m = "uploadChatAttachment"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lcq0/a;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcq0/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcq0/a;",
            "Lq83/d<",
            "-",
            "Lcq0/a$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcq0/a$j;->G:Lcq0/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcq0/a$j;->F:Ljava/lang/Object;

    iget p1, p0, Lcq0/a$j;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcq0/a$j;->H:I

    iget-object p1, p0, Lcq0/a$j;->G:Lcq0/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Lcq0/a;->l(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
