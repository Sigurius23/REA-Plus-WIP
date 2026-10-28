.class public final Llu2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Llu2/d;",
        "",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "<init>",
        "(Lzr2/a;)V",
        "Lad3/c;",
        "a",
        "Lad3/c;",
        "b",
        "()Lad3/c;",
        "json",
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
.field private final a:Lad3/c;


# direct methods
.method public constructor <init>(Lzr2/a;)V
    .locals 2

    const-string v0, "dateAndTimeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Llc0/c;

    const/4 v1, 0x7

    invoke-direct {v0, p1, v1}, Llc0/c;-><init>(Ljava/lang/Object;I)V

    sget-object p1, Lad3/c;->d:Lad3/b;

    invoke-static {p1, v0}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object p1

    iput-object p1, p0, Llu2/d;->a:Lad3/c;

    return-void
.end method

.method public static synthetic a(Lzr2/a;Lad3/g;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llu2/d;->c(Lzr2/a;Lad3/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lzr2/a;Lad3/g;)Ll83/a0;
    .locals 3

    const-string v0, "$this$Json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p1, Lad3/g;->a:Z

    iput-boolean v0, p1, Lad3/g;->c:Z

    new-instance v0, Lcd3/g;

    invoke-direct {v0}, Lcd3/g;-><init>()V

    new-instance v1, Llu2/b;

    invoke-direct {v1, p0}, Llu2/b;-><init>(Lzr2/a;)V

    const-class p0, Lorg/joda/time/DateTime;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    invoke-virtual {v0, p0, v1}, Lcd3/g;->k(Lj93/d;Lwc3/c;)V

    invoke-virtual {v0}, Lcd3/g;->r()Lcd3/d;

    move-result-object p0

    iput-object p0, p1, Lad3/g;->o:Lcd3/f;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b()Lad3/c;
    .locals 1

    iget-object v0, p0, Llu2/d;->a:Lad3/c;

    return-object v0
.end method
