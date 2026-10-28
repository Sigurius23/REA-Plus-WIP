.class public final Lgb/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# static fields
.field public static final w:Lgb/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgb/b;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lgb/b;->w:Lgb/b;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc0/o;

    check-cast p2, Leb/q;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
