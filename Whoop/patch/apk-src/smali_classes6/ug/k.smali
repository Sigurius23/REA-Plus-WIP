.class public final synthetic Lug/k;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Lug/k;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lug/k;

    const-string v4, "isDigit(C)Z"

    const/4 v5, 0x1

    const/4 v1, 0x1

    const-class v2, Lug/m;

    const-string v3, "isDigit"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lug/k;->w:Lug/k;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    const/16 v0, 0x30

    const/4 v1, 0x0

    if-gt v0, p1, :cond_0

    const/16 v0, 0x3a

    if-ge p1, v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
