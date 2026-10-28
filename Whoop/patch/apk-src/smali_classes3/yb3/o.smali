.class public final synthetic Lyb3/o;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Lyb3/o;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lyb3/o;

    const-string v4, "next()Lkotlin/text/MatchResult;"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, Lyb3/k;

    const-string v3, "next"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lyb3/o;->w:Lyb3/o;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lyb3/k;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lyb3/n;

    invoke-virtual {p1}, Lyb3/n;->d()Lyb3/n;

    move-result-object p1

    return-object p1
.end method
