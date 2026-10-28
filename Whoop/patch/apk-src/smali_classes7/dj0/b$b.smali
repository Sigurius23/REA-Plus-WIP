.class final Ldj0/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldj0/b;->p(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
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


# instance fields
.field final synthetic w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ldj0/b$b;->w:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lre/a;)V
    .locals 1

    const-string v0, "$this$AttributeType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "email"

    iput-object v0, p1, Lre/a;->a:Ljava/lang/String;

    iget-object v0, p0, Ldj0/b$b;->w:Ljava/lang/String;

    iput-object v0, p1, Lre/a;->b:Ljava/lang/String;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lre/a;

    invoke-virtual {p0, p1}, Ldj0/b$b;->a(Lre/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
