.class public final Lm93/t;
.super Lm93/x;
.source "SourceFile"

# interfaces
.implements Lm93/f;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 2

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-direct {p0, p1, v0, v1}, Lm93/x;-><init>(Ljava/lang/reflect/Method;ZI)V

    return-void
.end method


# virtual methods
.method public final call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lm93/y;->c([Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lm93/x;->e([Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
