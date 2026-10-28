.class public final Lah2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lah2/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lah2/a;",
        "",
        "Lfi0/a;",
        "baseAnalytics",
        "<init>",
        "(Lfi0/a;)V",
        "",
        "isStealthModeOn",
        "Ll83/a0;",
        "b",
        "(Z)V",
        "isOn",
        "Leh2/a;",
        "metric",
        "a",
        "(ZLeh2/a;)V",
        "Lfi0/a;",
        "stealth-mode_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Lah2/a$a;

.field public static final c:I


# instance fields
.field private final a:Lfi0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lah2/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lah2/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lah2/a;->b:Lah2/a$a;

    const/16 v0, 0x8

    sput v0, Lah2/a;->c:I

    return-void
.end method

.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "baseAnalytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lah2/a;->a:Lfi0/a;

    return-void
.end method


# virtual methods
.method public final a(ZLeh2/a;)V
    .locals 3

    const-string v0, "metric"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const-string p1, "Enable"

    goto :goto_0

    :cond_0
    const-string p1, "Disable"

    :goto_0
    iget-object v0, p0, Lah2/a;->a:Lfi0/a;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x0

    const-string v2, "Hide Metrics"

    invoke-interface {v0, v1, p1, p2, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Z)V
    .locals 9

    if-eqz p1, :cond_0

    const-string p1, "Enable"

    :goto_0
    move-object v2, p1

    goto :goto_1

    :cond_0
    const-string p1, "Disable"

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lah2/a;->a:Lfi0/a;

    const/16 v7, 0x34

    const/4 v8, 0x0

    const-string v1, "Settings"

    const/4 v3, 0x0

    const-string v4, "Hide Recovery and Sleep"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method
