.class public final Lla2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lla2/a;",
        "Lla2/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ#\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lla2/b;",
        "Lod1/g;",
        "Lla2/a;",
        "Lla2/c;",
        "Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;",
        "api",
        "Lha2/a;",
        "analyticsHelper",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;Lha2/a;Ltr2/n;)V",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;",
        "b",
        "Lha2/a;",
        "c",
        "Ltr2/n;",
        "settings_release"
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
.field private final a:Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;

.field private final b:Lha2/a;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;Lha2/a;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lla2/b;->a:Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;

    .line 3
    iput-object p2, p0, Lla2/b;->b:Lha2/a;

    .line 4
    iput-object p3, p0, Lla2/b;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;Lha2/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "MyAccountHeaderInteractor"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lla2/b;-><init>(Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;Lha2/a;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lla2/b;)Lha2/a;
    .locals 0

    iget-object p0, p0, Lla2/b;->b:Lha2/a;

    return-object p0
.end method

.method public static final synthetic d(Lla2/b;)Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;
    .locals 0

    iget-object p0, p0, Lla2/b;->a:Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;

    return-object p0
.end method

.method public static final synthetic e(Lla2/b;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lla2/b;->c:Ltr2/n;

    return-object p0
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lla2/b$a;

    invoke-direct {v0, p1, p0}, Lla2/b$a;-><init>(Lec3/l;Lla2/b;)V

    return-object v0
.end method
