.class public final Lfu2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lfu2/f;",
        "",
        "Liu2/a;",
        "strengthTrainerPacketManager",
        "Lu92/d;",
        "prefsStore",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Liu2/a;Lu92/d;Ltr2/n;)V",
        "Lbc3/c0;",
        "coroutineScope",
        "Ll83/a0;",
        "e",
        "(Lbc3/c0;)V",
        "d",
        "a",
        "Liu2/a;",
        "b",
        "Lu92/d;",
        "c",
        "Ltr2/n;",
        "weightlifting_release"
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
.field private final a:Liu2/a;

.field private final b:Lu92/d;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Liu2/a;Lu92/d;Ltr2/n;)V
    .locals 1

    const-string v0, "strengthTrainerPacketManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefsStore"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfu2/f;->a:Liu2/a;

    iput-object p2, p0, Lfu2/f;->b:Lu92/d;

    iput-object p3, p0, Lfu2/f;->c:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lfu2/f;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lfu2/f;->c:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic b(Lfu2/f;)Lu92/d;
    .locals 0

    iget-object p0, p0, Lfu2/f;->b:Lu92/d;

    return-object p0
.end method

.method public static final synthetic c(Lfu2/f;)Liu2/a;
    .locals 0

    iget-object p0, p0, Lfu2/f;->a:Liu2/a;

    return-object p0
.end method

.method private final e(Lbc3/c0;)V
    .locals 3

    new-instance v0, Lfu2/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lfu2/f$a;-><init>(Lfu2/f;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public final d(Lbc3/c0;)V
    .locals 1

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lfu2/f;->e(Lbc3/c0;)V

    return-void
.end method
