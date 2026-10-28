.class public interface abstract Ltg/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ltg/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ltg/d;->a:Ltg/d;

    sput-object v0, Ltg/e;->a:Ltg/d;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract b(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public c(Ljava/lang/String;)Ltg/b;
    .locals 2

    const-string v0, "decoded"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltg/b;

    invoke-interface {p0, p1}, Ltg/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1, p0}, Ltg/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ltg/e;)V

    return-object v0
.end method

.method public d(Ljava/lang/String;)Ltg/b;
    .locals 2

    const-string v0, "encoded"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltg/b;

    invoke-interface {p0, p1}, Ltg/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1, p0}, Ltg/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ltg/e;)V

    return-object v0
.end method

.method public abstract getName()Ljava/lang/String;
.end method
