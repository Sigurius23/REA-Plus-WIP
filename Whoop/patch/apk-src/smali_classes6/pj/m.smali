.class public final Lpj/m;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Lpj/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpj/m;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lpj/m;->w:Lpj/m;

    return-void
.end method


# virtual methods
.method public final synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lh2/b;

    iget-wide v0, p1, Lh2/b;->a:J

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
