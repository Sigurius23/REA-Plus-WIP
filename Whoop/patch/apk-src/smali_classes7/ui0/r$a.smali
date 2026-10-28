.class final synthetic Lui0/r$a;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lui0/r;->f(Lcom/whoop/archv2/feature/domain/p;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final w:Lui0/r$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lui0/r$a;

    invoke-direct {v0}, Lui0/r$a;-><init>()V

    sput-object v0, Lui0/r$a;->w:Lui0/r$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "captureUriFor(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;"

    const/4 v5, 0x1

    const/4 v1, 0x2

    const-class v2, Lui0/c;

    const-string v3, "captureUriFor"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lui0/c;->h(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/io/File;

    invoke-virtual {p0, p1, p2}, Lui0/r$a;->a(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method
