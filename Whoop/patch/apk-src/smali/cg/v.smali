.class public final synthetic Lcg/v;
.super Lkotlin/jvm/internal/x;
.source "SourceFile"


# static fields
.field public static final w:Lcg/v;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcg/v;

    const-string v1, "getEncoded()Ljava/lang/String;"

    const/4 v2, 0x0

    const-class v3, Ltg/b;

    const-string v4, "encoded"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lcg/v;->w:Lcg/v;

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ltg/b;

    iget-object p1, p1, Ltg/b;->b:Ljava/lang/String;

    return-object p1
.end method
