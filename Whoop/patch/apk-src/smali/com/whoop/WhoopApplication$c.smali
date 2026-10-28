.class public final Lcom/whoop/WhoopApplication$c;
.super Loh3/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/WhoopApplication;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J3\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "com/whoop/WhoopApplication$c",
        "Loh3/b;",
        "",
        "priority",
        "",
        "tag",
        "message",
        "",
        "t",
        "Ll83/a0;",
        "k",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V",
        "app_prodStandardRelease"
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
.field final synthetic e:Ltr2/n;


# direct methods
.method public constructor <init>(Ltr2/n;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/WhoopApplication$c;->e:Ltr2/n;

    invoke-direct {p0}, Loh3/b;-><init>()V

    return-void
.end method


# virtual methods
.method public k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/WhoopApplication$c;->e:Ltr2/n;

    invoke-interface {v0, p1, p2, p3, p4}, Ltr2/n;->h(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
