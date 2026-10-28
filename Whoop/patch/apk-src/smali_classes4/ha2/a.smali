.class public final Lha2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lha2/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u000cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lha2/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "",
        "billingOffer",
        "Ll83/a0;",
        "b",
        "(Ljava/lang/String;)V",
        "ctaText",
        "a",
        "Lfi0/a;",
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


# static fields
.field public static final b:Lha2/a$a;

.field public static final c:I


# instance fields
.field private final a:Lfi0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lha2/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lha2/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lha2/a;->b:Lha2/a$a;

    const/16 v0, 0x8

    sput v0, Lha2/a;->c:I

    return-void
.end method

.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lha2/a;->a:Lfi0/a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 10

    const-string v0, "ctaText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lha2/a;->a:Lfi0/a;

    const-string v0, "CTA Text"

    invoke-static {v0, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    const/16 v8, 0x15

    const/4 v9, 0x0

    const/4 v2, 0x0

    const-string v3, "Click"

    const/4 v4, 0x0

    const-string v5, "My Account Header"

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 9

    if-eqz p1, :cond_0

    iget-object v0, p0, Lha2/a;->a:Lfi0/a;

    new-instance v1, Ll83/k;

    const-string v2, "Billing offer"

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    const-string v2, "isV2"

    const-string v3, "true"

    invoke-direct {p1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, p1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v6

    const/16 v7, 0x15

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v2, "View"

    const/4 v3, 0x0

    const-string v4, "My Account Header"

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method
