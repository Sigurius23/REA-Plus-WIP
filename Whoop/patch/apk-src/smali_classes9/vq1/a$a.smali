.class final Lvq1/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvq1/a;-><init>()V
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


# static fields
.field public static final w:Lvq1/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvq1/a$a;

    invoke-direct {v0}, Lvq1/a$a;-><init>()V

    sput-object v0, Lvq1/a$a;->w:Lvq1/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Li21/a;)Ljava/lang/Object;
    .locals 2

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltq1/a$b;

    invoke-virtual {p1}, Li21/a;->a()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {p1}, Li21/a;->b()Z

    move-result p1

    invoke-direct {v0, v1, p1}, Ltq1/a$b;-><init>(Ljava/util/UUID;Z)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li21/a;

    invoke-virtual {p0, p1}, Lvq1/a$a;->a(Li21/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
