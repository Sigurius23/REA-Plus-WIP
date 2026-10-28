.class public final Ls93/m;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Ls93/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls93/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ls93/m;->w:Ls93/m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ls93/i;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object p1

    return-object p1
.end method
