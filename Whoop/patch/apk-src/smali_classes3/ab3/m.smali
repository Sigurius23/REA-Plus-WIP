.class public final Lab3/m;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Lab3/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lab3/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lab3/m;->w:Lab3/m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Llb3/y;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
