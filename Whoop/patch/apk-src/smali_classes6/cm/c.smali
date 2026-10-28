.class public final Lcm/c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Lcm/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcm/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lcm/c;->w:Lcm/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Li2/x;

    iget-wide v0, p1, Li2/x;->a:J

    sget-wide v2, Lcm/d;->a:J

    invoke-static {v2, v3, v0, v1}, Li2/w0;->p(JJ)J

    move-result-wide v0

    new-instance p1, Li2/x;

    invoke-direct {p1, v0, v1}, Li2/x;-><init>(J)V

    return-object p1
.end method
