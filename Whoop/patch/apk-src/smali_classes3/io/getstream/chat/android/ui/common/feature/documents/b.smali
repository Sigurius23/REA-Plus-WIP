.class public final synthetic Lio/getstream/chat/android/ui/common/feature/documents/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lkotlin/jvm/internal/g0;

.field public final synthetic x:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/g0;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/documents/b;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/documents/b;->x:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/documents/b;->w:Lkotlin/jvm/internal/g0;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/documents/b;->x:Landroid/content/Context;

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->f(Lkotlin/jvm/internal/g0;Landroid/content/Context;JJ)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
