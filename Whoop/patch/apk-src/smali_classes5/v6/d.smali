.class public final synthetic Lv6/d;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lv6/d;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lv6/d;

    const-string v4, "<init>()V"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-class v2, Lv6/j;

    const-string v3, "<init>"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lv6/d;->w:Lv6/d;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    new-instance v0, Lv6/j;

    invoke-direct {v0}, Lv6/j;-><init>()V

    return-object v0
.end method
