.class public final Lm91/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JA\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lm91/g;",
        "",
        "<init>",
        "()V",
        "Lm91/o;",
        "itemWrapper",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "action",
        "Lvc1/a;",
        "itemTapReporter",
        "b",
        "(Lm91/o;Lkotlin/jvm/functions/Function1;Lvc1/a;)Lkotlin/jvm/functions/Function1;",
        "design_release"
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
.field public static final a:Lm91/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm91/g;

    invoke-direct {v0}, Lm91/g;-><init>()V

    sput-object v0, Lm91/g;->a:Lm91/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lvc1/a;Lm91/o;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lm91/g;->c(Lvc1/a;Lm91/o;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lvc1/a;Lm91/o;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "argument"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Lvc1/a;->a(Lm91/o;)V

    :cond_0
    invoke-virtual {p1}, Lm91/o;->d()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p0

    invoke-static {p3, p0}, Lm91/h;->a(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b(Lm91/o;Lkotlin/jvm/functions/Function1;Lvc1/a;)Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/o;",
            "Lkotlin/jvm/functions/Function1;",
            "Lvc1/a;",
            ")",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    const-string v0, "itemWrapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljs2/h;

    const/16 v1, 0x12

    invoke-direct {v0, p3, p1, p2, v1}, Ljs2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-object v0
.end method
