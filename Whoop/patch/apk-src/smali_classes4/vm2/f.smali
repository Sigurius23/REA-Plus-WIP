.class public final Lvm2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lvm2/f;",
        "",
        "Lji0/f;",
        "bffBottomNavConfigSource",
        "Lvm2/a;",
        "appConfigurationTabResolver",
        "",
        "homeGraphStartDestinationId",
        "<init>",
        "(Lji0/f;Lvm2/a;I)V",
        "Lj02/m0;",
        "a",
        "()Lj02/m0;",
        "Lji0/f;",
        "b",
        "Lvm2/a;",
        "c",
        "I",
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
.field private final a:Lji0/f;

.field private final b:Lvm2/a;

.field private final c:I


# direct methods
.method public constructor <init>(Lji0/f;Lvm2/a;I)V
    .locals 1

    const-string v0, "bffBottomNavConfigSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appConfigurationTabResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvm2/f;->a:Lji0/f;

    iput-object p2, p0, Lvm2/f;->b:Lvm2/a;

    iput p3, p0, Lvm2/f;->c:I

    return-void
.end method


# virtual methods
.method public final a()Lj02/m0;
    .locals 12

    iget-object v0, p0, Lvm2/f;->a:Lji0/f;

    invoke-interface {v0}, Lji0/f;->b()Lcom/whoop/appconfiguration/TabConfiguration;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v2, p0, Lvm2/f;->b:Lvm2/a;

    invoke-virtual {v2, v0}, Lvm2/a;->a(Lcom/whoop/appconfiguration/TabConfiguration;)Lj02/m0;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v5, p0, Lvm2/f;->c:I

    new-instance v2, Leb/x0;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, -0x1

    move v9, v8

    move v10, v8

    move v11, v8

    invoke-direct/range {v2 .. v11}, Leb/x0;-><init>(ZZIZZIIII)V

    invoke-static {v0, v2}, Lvm2/e;->a(Lj02/m0;Leb/x0;)Lj02/m0;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v1
.end method
