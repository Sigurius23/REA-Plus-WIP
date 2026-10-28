.class public final Ll02/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u0017\u0010\u000f\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Ll02/a;",
        "",
        "Lad3/c;",
        "json",
        "<init>",
        "(Lad3/c;)V",
        "a",
        "Lad3/c;",
        "c",
        "()Lad3/c;",
        "Ltr2/n;",
        "b",
        "Ltr2/n;",
        "d",
        "()Ltr2/n;",
        "logger",
        "navigation_release"
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
.field public static final c:I = 0x8


# instance fields
.field private final a:Lad3/c;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lad3/c;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ll02/a;->a:Lad3/c;

    .line 3
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "NavigationQueryParamDeserializer"

    invoke-virtual {p1, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Ll02/a;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lad3/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    new-instance p1, Lkg2/e;

    const/4 p2, 0x6

    invoke-direct {p1, p2}, Lkg2/e;-><init>(I)V

    .line 5
    sget-object p2, Lad3/c;->d:Lad3/b;

    invoke-static {p2, p1}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object p1

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Ll02/a;-><init>(Lad3/c;)V

    return-void
.end method

.method public static synthetic a(Lad3/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ll02/a;->b(Lad3/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lad3/g;)Ll83/a0;
    .locals 1

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lad3/g;->c:Z

    iput-boolean v0, p0, Lad3/g;->g:Z

    iput-boolean v0, p0, Lad3/g;->l:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final c()Lad3/c;
    .locals 1

    iget-object v0, p0, Ll02/a;->a:Lad3/c;

    return-object v0
.end method

.method public final d()Ltr2/n;
    .locals 1

    iget-object v0, p0, Ll02/a;->b:Ltr2/n;

    return-object v0
.end method
