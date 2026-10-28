.class public final Ll3/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Ll3/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll3/j0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll3/j0;->w:Ll3/j0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-wide v0, Li2/x;->n:J

    new-instance p1, Li2/x;

    invoke-direct {p1, v0, v1}, Li2/x;-><init>(J)V

    return-object p1

    :cond_0
    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Li2/w0;->c(I)J

    move-result-wide v0

    new-instance p1, Li2/x;

    invoke-direct {p1, v0, v1}, Li2/x;-><init>(J)V

    return-object p1
.end method
