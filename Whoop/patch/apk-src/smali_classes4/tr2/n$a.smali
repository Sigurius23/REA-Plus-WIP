.class public final Ltr2/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltr2/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\"\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Ltr2/n$a;",
        "",
        "<init>",
        "()V",
        "",
        "tag",
        "Ltr2/n;",
        "a",
        "(Ljava/lang/String;)Ltr2/n;",
        "",
        "vEnabled",
        "b",
        "(Ljava/lang/String;Z)Ltr2/n;",
        "Ltr2/n;",
        "c",
        "()Ltr2/n;",
        "d",
        "(Ltr2/n;)V",
        "logger",
        "logging_release"
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
.field static final synthetic a:Ltr2/n$a;

.field private static b:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltr2/n$a;

    invoke-direct {v0}, Ltr2/n$a;-><init>()V

    sput-object v0, Ltr2/n$a;->a:Ltr2/n$a;

    sget-object v0, Lor2/f1;->b:Lor2/f1;

    sput-object v0, Ltr2/n$a;->b:Ltr2/n;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ltr2/n;
    .locals 7

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ltr2/o;

    sget-object v2, Ltr2/n$a;->b:Ltr2/n;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Ltr2/o;-><init>(Ltr2/n;Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final b(Ljava/lang/String;Z)Ltr2/n;
    .locals 2

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltr2/o;

    sget-object v1, Ltr2/n$a;->b:Ltr2/n;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-direct {v0, v1, p1, p2}, Ltr2/o;-><init>(Ltr2/n;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public final c()Ltr2/n;
    .locals 1

    sget-object v0, Ltr2/n$a;->b:Ltr2/n;

    return-object v0
.end method

.method public final d(Ltr2/n;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Ltr2/n$a;->b:Ltr2/n;

    return-void
.end method
