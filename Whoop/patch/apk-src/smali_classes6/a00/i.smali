.class public final La00/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwz/g0;

.field public final b:Lv00/c0;

.field public final c:Lqy/d;


# direct methods
.method public constructor <init>(Lwz/g0;Lv00/c0;Lqy/d;)V
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodMetadata"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La00/i;->a:Lwz/g0;

    iput-object p2, p0, La00/i;->b:Lv00/c0;

    iput-object p3, p0, La00/i;->c:Lqy/d;

    return-void
.end method


# virtual methods
.method public final a(Le10/r0;)La00/g;
    .locals 4

    const-string v0, "confirmationHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La00/g;

    iget-object v1, p0, La00/i;->a:Lwz/g0;

    iget-object v2, p0, La00/i;->b:Lv00/c0;

    iget-object v3, p0, La00/i;->c:Lqy/d;

    invoke-direct {v0, v1, v2, v3, p1}, La00/g;-><init>(Lwz/g0;Lv00/c0;Lqy/d;Le10/r0;)V

    return-object v0
.end method
