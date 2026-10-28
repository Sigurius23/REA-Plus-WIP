.class public final Lu82/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu82/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J%\u0010\u000b\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00062\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lu82/i;",
        "Lu82/a;",
        "Lad3/c;",
        "json",
        "<init>",
        "(Lad3/c;)V",
        "T",
        "",
        "string",
        "Ljava/lang/reflect/Type;",
        "type",
        "a",
        "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;",
        "Lad3/c;",
        "serialization_release"
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
.method public constructor <init>(Lad3/c;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu82/i;->a:Lad3/c;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lu82/i;->a:Lad3/c;

    iget-object v0, v0, Lad3/c;->b:Lcd3/f;

    invoke-static {v0, p2}, Lvb/g;->h(Lcd3/f;Ljava/lang/reflect/Type;)Lwc3/c;

    move-result-object p2

    iget-object v0, p0, Lu82/i;->a:Lad3/c;

    check-cast p2, Lwc3/b;

    invoke-virtual {v0, p2, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
